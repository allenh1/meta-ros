# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Feathery lightweight web server for ROS, that is based on  web server module."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native rosbridge-server rosgraph rospack"
SRC_URI = "https://github.com/ros-gbp/${PN}-release/archive/release/kinetic/${PN}/0.1.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d2ce1a73e80e8393a3bb0d3fcbb6b7f3"
SRC_URI[sha256sum] = "2f161d6a711b33a04c392b79f184998e979c1aac461f92d085d25efddea2afcd"
S = "${WORKDIR}/${PN}-release-release-kinetic-${PN}-0.1.10-0"

inherit catkin
