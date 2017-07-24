# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_serial_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost python-empy-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_serial_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1e5c33bd20a5a5be8f6366b09576b7d"
SRC_URI[sha256sum] = "0db87259fdb9d15511319ca6d8d08fcc2771faf8f3c4aa461e4f1b8a7da72e79"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_serial_util-0.3.0-0"

inherit catkin
