# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_android package provides tools for android apps operation."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-android-msgs cob-android-resource-server cob-android-script-server cob-android-settings"
SRC_URI = "https://github.com/ipa320/cob_android-release/archive/release/kinetic/cob_android/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f99a3bf19cbb0780c3c9b2571536899"
SRC_URI[sha256sum] = "02293f8839c259da95c7e6de3c3431647a872df9155f10b7e05cf834801fa55c"
S = "${WORKDIR}/cob_android-release-release-kinetic-cob_android-0.1.3-0"

inherit catkin
