# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_math_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin roscpp"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_math_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b63e2489314c607ab1e112564dab9738"
SRC_URI[sha256sum] = "1ea01a69ddba9f8925a4a0b8937ae1fc0e27de9873564eef31aa64531ed7e2d1"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
