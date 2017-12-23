# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wraps the ViSP moving edge tracker provided by the ViSP visual     servoing libr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs image-proc image-transport message-generation message-runtime nodelet resource-retriever roscpp rospy sensor-msgs std-msgs tf visp"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/visp_tracker/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4f5d6332f651a0009f807e9c9029ae77"
SRC_URI[sha256sum] = "e6ff6da2fb4fb508010133657ab883caf1736698055305225ae5720683e79f1a"
S = "${WORKDIR}/vision_visp-release-release-kinetic-visp_tracker-0.10.0-0"

inherit catkin
