# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for interfacing with various computer vision pipelines, such as     obj"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/Kukanani/vision_msgs-release/archive/release/kinetic/vision_msgs/0.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8c6c854509ebbf67b4f31a265ab40ef"
SRC_URI[sha256sum] = "b4694f3ac1188fc6194b887c778a33b265bad66346dd17ffdd5f2080a067c0ba"
S = "${WORKDIR}/vision_msgs-release-release-kinetic-vision_msgs-0.0.1-0"

inherit catkin
