# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs image-transport rqt-gui rqt-gui-cpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_image_view-release/archive/release/lunar/rqt_image_view/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d341b8cd6eb999191b82f254711c6af3"
SRC_URI[sha256sum] = "ac5f1281c3422079ef7d11362934ae418820a1be33250b0a5f48fd46ea9529b4"
S = "${WORKDIR}/rqt_image_view-release-release-lunar-rqt_image_view-0.4.8-0"

inherit catkin
