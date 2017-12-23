# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosconsole_bridge is a package used in conjunction with console_bridge and rosco"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native console-bridge rosconsole"
SRC_URI = "https://github.com/ros-gbp/rosconsole_bridge-release/archive/release/kinetic/rosconsole_bridge/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81fa8e15d674eb8dd5bca4177eb99948"
SRC_URI[sha256sum] = "3bb580e1d4517762b3a8fbd6ba310235300191660557f29657c79e15dd2104c1"
S = "${WORKDIR}/rosconsole_bridge-release-release-kinetic-rosconsole_bridge-0.5.1-0"

inherit catkin
