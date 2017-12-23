# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for interfacing with various computer vision pipelines, such as     obj"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/Kukanani/vision_msgs-release/archive/release/lunar/vision_msgs/0.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "97e5c782ed9b9846f44d62e328456424"
SRC_URI[sha256sum] = "1511bad2bba7906a24b69eb5ccd047027cd935928a9a8ad8eccee596b06e225b"
S = "${WORKDIR}/vision_msgs-release-release-lunar-vision_msgs-0.0.1-1"

inherit catkin
