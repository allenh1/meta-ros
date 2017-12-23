# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_perception_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_perception_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6db1d901de288a993535053eba4dd3e"
SRC_URI[sha256sum] = "f1772726f7697b0102fa747d50bf482714a5c647cd82bb907cc2c37b64a90778"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_perception_msgs-0.4.0-0"

inherit catkin
