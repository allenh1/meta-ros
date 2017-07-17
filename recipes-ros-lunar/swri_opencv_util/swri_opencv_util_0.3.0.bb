# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_opencv_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=2fa3384e3b9751bb82b0db0d08978729"

DEPENDS = "catkin cv_bridge swri_math_util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_opencv_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4aad52badae17b907fdbcb9c617afb4"
SRC_URI[sha256sum] = "687ac206cb89300f56976e6e8b6d6c790227994960990b0a0d4b4b2cf9cf0f4c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
