# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Aldebaran's libqi: a core library for NAOqiOS development"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/ros-naoqi/libqi-release/archive/release/kinetic/naoqi_libqi/2.5.0-3.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "649a14f3e60a83812b0655306534e22e"
SRC_URI[sha256sum] = "6f66801ecd8acb3f681d7954458c683df2afa06e624e4c7ee923d143552e2d3c"
S = "${WORKDIR}/libqi-release-release-kinetic-naoqi_libqi-2.5.0-3"

inherit catkin
