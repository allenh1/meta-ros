# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_gui_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/kinetic/jsk_gui_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bb47afa42f48ce87e3f5c748e7c45b0a"
SRC_URI[sha256sum] = "f9bb110f7f87c77e8ce6316553677082f68c5a9d2b8714a611d3ca685b8e09d6"
S = "${WORKDIR}/jsk_common_msgs-release-release-kinetic-jsk_gui_msgs-4.3.1-0"

inherit catkin
