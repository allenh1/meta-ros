# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message_generation message_runtime sensor_msgs std_msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_perception_msgs/0.0.9-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f3e3f3b48c44432aff4792d53a25ff03"
SRC_URI[sha256sum] = "1b4f4f6c12225a4a63f01e5b39c0f66321639ae00b2cdfff38281b454b5514e2"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
