# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "swri_image_util"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers catkin cv-bridge eigen geometry-msgs image-geometry image-transport message-filters nav-msgs nodelet pkgconfig roscpp rospy std-msgs swri-geometry-util swri-math-util swri-opencv-util tf"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_image_util/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c9c976dd7940deb7657467d11d38d4a"
SRC_URI[sha256sum] = "f15129feb7981f9d0480e7960f33168d86ac7b65f53dc5be70787955c7253537"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_image_util-0.3.0-0"

inherit catkin
