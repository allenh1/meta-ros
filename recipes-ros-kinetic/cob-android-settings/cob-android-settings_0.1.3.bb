# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_android_settings"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/kinetic/cob_android_settings/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c438f6470a2d3c1e355c254e3a2da8e3"
SRC_URI[sha256sum] = "3111ef41b1cc4853610908e590417ec227d85aa95f2e83cf60dda23b1d8b9bfa"
S = "${WORKDIR}/cob_android-release-release-kinetic-cob_android_settings-0.1.3-0"

inherit catkin
