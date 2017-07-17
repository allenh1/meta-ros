# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_string_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=3c3409ba9d9dbf7a561ab33945df9ad3"

DEPENDS = "catkin"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_string_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc735c0d85eed51b19b5ab62531b1abc"
SRC_URI[sha256sum] = "d57ea8dd6bf1a98c04631139fcca1e5b138799fce7d1da367788605dc173b348"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
