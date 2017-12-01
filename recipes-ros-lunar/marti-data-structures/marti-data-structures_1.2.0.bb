# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_data_structures"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/marti_data_structures/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9d47d10e618af7ecb9d4cebf955c35d7"
SRC_URI[sha256sum] = "f63b537d643984601be1c0bf9fdb37beffe92cf3c830394d0591f27e2cd8c905"
S = "${WORKDIR}/marti_common-release-release-lunar-marti_data_structures-1.2.0-0"

inherit catkin
