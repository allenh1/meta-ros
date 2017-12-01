# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_string_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_string_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc735c0d85eed51b19b5ab62531b1abc"
SRC_URI[sha256sum] = "d57ea8dd6bf1a98c04631139fcca1e5b138799fce7d1da367788605dc173b348"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_string_util-0.3.0-0"

inherit catkin
