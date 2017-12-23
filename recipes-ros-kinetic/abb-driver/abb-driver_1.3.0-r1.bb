# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native industrial-robot-client"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_driver/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "404f416cfc7c3be44e42e07c6ba06673"
SRC_URI[sha256sum] = "96d96d288b6c389f94df427ac061ce3eaba78bea0f19559ca45fdc1ce3a6abe8"
S = "${WORKDIR}/abb-release-release-kinetic-abb_driver-1.3.0-1"

inherit catkin
