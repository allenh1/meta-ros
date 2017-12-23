# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A simple viewer for ROS image topics with draw-on features"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cv-bridge geometry-msgs image-geometry image-transport image-view message-filters message-generation message-runtime pcl-ros roscpp rostest sensor-msgs std-msgs std-srvs tf"
SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/kinetic/image_view2/2.2.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bdbe1019dfcd37b0f4e0869467fa1e11"
SRC_URI[sha256sum] = "70944c01867f456e31c255aa976a909f7dbd68d182f9c87e21333b9d635a0de4"
S = "${WORKDIR}/jsk_common-release-release-kinetic-image_view2-2.2.5-0"

inherit catkin
