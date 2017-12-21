# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Aldebaran's libqi: a core library for NAOqiOS development"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native"
SRC_URI = "https://github.com/ros-naoqi/libqi-release/archive/release/lunar/naoqi_libqi/2.5.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "116a688eb412ca69a484ea2eeee309de"
SRC_URI[sha256sum] = "358c065cec4769dd9038a2fc5ac40566f12e2090a2a0cf1eb8f92abc30a2e857"
S = "${WORKDIR}/libqi-release-release-lunar-naoqi_libqi-2.5.0-2"

inherit catkin
