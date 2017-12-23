# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_string_util"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_string_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e3120ad4aeac2d0b42d8cea264af3428"
SRC_URI[sha256sum] = "7157371fc10df81f5f83d02517387a5b618979652f0f6645a63661d23876e671"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_string_util-2.0.0-0"

inherit catkin
