# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Internal packaging of the 2.2.2 version of the python semantic version module."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_semantic_version/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "300a25b6171ae6436d22d4736de0aad9"
SRC_URI[sha256sum] = "0506b915ccd5d60629a10843b2ed4c93b73b8e0f092e6892701c15be3cd76c10"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_semantic_version-0.3.2-1"

inherit catkin
