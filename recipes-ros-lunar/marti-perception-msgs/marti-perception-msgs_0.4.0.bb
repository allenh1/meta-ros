# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_perception_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_perception_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "39124437e7d431def41284ebe2334b37"
SRC_URI[sha256sum] = "c9bda1897befa249e4dcb2dd0a42f309b7686791f34213b74285a394ab444522"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_perception_msgs-0.4.0-0"

inherit catkin
