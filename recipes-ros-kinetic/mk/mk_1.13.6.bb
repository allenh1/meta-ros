# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A collection of .mk include files for building ROS architectural elements.     M"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rosbuild"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/kinetic/${PN}/1.13.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf89fc9d675ac976f3f3ef066fc86fb6"
SRC_URI[sha256sum] = "7d561dbd7e014a9d694bedff63405a6a79ab99faa41f0c838eece8bd2ac1732b"
S = "${WORKDIR}/ros-release-release-kinetic-${PN}-1.13.6-0"

inherit catkin
