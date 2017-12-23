# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_image_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin-native cv-bridge eigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet pkgconfig roscpp rospy std-msgs swri-geometry-util swri-math-util swri-nodelet swri-opencv-util swri-roscpp tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_image_util/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e8903c8722d3b688db0756d8028154c2"
SRC_URI[sha256sum] = "1ccc352d9d8e789c5935b4f276aeac022f9d508fab3ddbcf9eb799207742de50"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_image_util-2.0.0-0"

inherit catkin
