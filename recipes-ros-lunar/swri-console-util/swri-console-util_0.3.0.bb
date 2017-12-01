# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_console_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp swri-math-util"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_console_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c465e78b5e91cfbc0b2754b4205210ec"
SRC_URI[sha256sum] = "35219b2100273aed51af29b5eb003abf86e9e72996343bf30cf0f1f051ff553e"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_console_util-0.3.0-0"

inherit catkin
