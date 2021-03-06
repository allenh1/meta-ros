# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_gui_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_gui_msgs/4.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "55a96f8cbc68786897f85db185b1e8ab"
SRC_URI[sha256sum] = "8922f176f7668d939c9632b4c480dea0725eef666ca16c0f29206f8b5e0e8676"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_gui_msgs-4.2.0-0"

inherit catkin
