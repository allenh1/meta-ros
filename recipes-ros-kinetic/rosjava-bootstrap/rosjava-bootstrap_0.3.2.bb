# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bootstrap utilities for rosjava builds."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native rosjava-build-tools"
SRC_URI = "https://github.com/rosjava-release/rosjava_bootstrap-release/archive/release/kinetic/rosjava_bootstrap/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4f011dee3179d49a06ffc41df82ce25"
SRC_URI[sha256sum] = "3252e4c8e03cda747adb640d8198c0ed001ad7ddaeea2c4851c33e93a29415be"
S = "${WORKDIR}/rosjava_bootstrap-release-release-kinetic-rosjava_bootstrap-0.3.2-0"

inherit catkin
