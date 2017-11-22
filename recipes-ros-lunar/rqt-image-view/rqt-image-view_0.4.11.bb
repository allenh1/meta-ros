# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin cv-bridge geometry-msgs image-transport rqt-gui rqt-gui-cpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_image_view-release/archive/release/lunar/rqt_image_view/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3a0d030232633ff67e7cf9202ee450b8"
SRC_URI[sha256sum] = "28b373d639527ac03523fffc0fdd0f5152dd70bdb631000edbb816bedf4240da"
S = "${WORKDIR}/rqt_image_view-release-release-lunar-rqt_image_view-0.4.11-0"

inherit catkin
