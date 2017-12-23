# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_image_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native cv-bridge eigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet pkgconfig roscpp rospy std-msgs swri-geometry-util swri-math-util swri-nodelet swri-opencv-util swri-roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/kinetic/swri_image_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "938f964d851d2529a7fa86bb0742f02a"
SRC_URI[sha256sum] = "1ee1447e91d69af2594f0b137cdce9a8f0a7ac664a7f7d9e0db3165178bad183"
S = "${WORKDIR}/marti_common-release-release-kinetic-swri_image_util-2.0.0-0"

inherit catkin
