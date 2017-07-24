# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_opencv_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cv-bridge swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_opencv_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4aad52badae17b907fdbcb9c617afb4"
SRC_URI[sha256sum] = "687ac206cb89300f56976e6e8b6d6c790227994960990b0a0d4b4b2cf9cf0f4c"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_opencv_util-0.3.0-0"

inherit catkin
