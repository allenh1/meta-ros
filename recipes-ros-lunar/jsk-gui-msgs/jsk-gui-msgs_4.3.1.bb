# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "jsk_gui_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native catkin geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_gui_msgs/4.3.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "888e7af09caa7d9a020b14be356238f3"
SRC_URI[sha256sum] = "2c6443c12dd9522efad3cd1b1ea9fe2ff7d615f852f1be082aa902f4a804c9e4"
S = "${WORKDIR}/jsk_common_msgs-release-release-lunar-jsk_gui_msgs-4.3.1-0"

inherit catkin
