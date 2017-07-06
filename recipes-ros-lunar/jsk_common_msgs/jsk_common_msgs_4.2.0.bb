# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin jsk_footstep_msgs jsk_gui_msgs jsk_hark_msgs posedetection_msgs speech_recognition_msgs"
SRC_URI = "https://github.com/tork-a/jsk_common_msgs-release/archive/release/lunar/jsk_common_msgs/4.2.0-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2d3a0f7210feda04ddeeee31189cc8b7"
SRC_URI[sha256sum] = "9053d2473bc53025412d217c5dffa0c0c2d9bb634f52fad933c2dbfa48e3465b"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
