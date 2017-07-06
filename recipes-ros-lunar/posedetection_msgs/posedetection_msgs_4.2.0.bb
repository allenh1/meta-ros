# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin cv_bridge geometry_msgs message_filters message_generation message_runtime roscpp sensor_msgs std_msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/posedetection_msgs/4.2.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a3401cc0658827b01489446f31c5751"
SRC_URI[sha256sum] = "3016800be88dc610a6a0a524a95f87673ac3c741f8a4ade8dd7deae4b29ce901"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
