# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosconsole_bridge is a package used in conjunction with console_bridge and rosco"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin console-bridge rosconsole"
SRC_URI = "https://github.com/ros-gbp/rosconsole_bridge-release/archive/release/lunar/rosconsole_bridge/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a048186f859882d31f13632aa5ca2b9e"
SRC_URI[sha256sum] = "a36df89e6b0bab2c0d76b129bb9e84e42a8616f46e2f58762ed8eaa7239ae703"
S = "${WORKDIR}/rosconsole_bridge-release-release-lunar-rosconsole_bridge-0.5.0-0"

inherit catkin
