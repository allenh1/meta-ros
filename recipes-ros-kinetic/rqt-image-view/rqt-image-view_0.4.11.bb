# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_image_view provides a GUI plugin for displaying images using image_transport"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs image-transport rqt-gui rqt-gui-cpp sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_image_view-release/archive/release/kinetic/rqt_image_view/0.4.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c7d49f377b09d68c7c6ae1a6513dcedc"
SRC_URI[sha256sum] = "d4d853d20fbd9730ea2212eaa1462bb63e2087d6ba7a85d3e4c5a8a3ef539db9"
S = "${WORKDIR}/rqt_image_view-release-release-kinetic-rqt_image_view-0.4.11-0"

inherit catkin
