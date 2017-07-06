# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=6;endline=6;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin nodelet nodelet_topic_tools"
SRC_URI = "https://github.com/ros-gbp/nodelet_core-release/archive/release/lunar/nodelet_core/1.9.10-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3cf306efa78191d4e9a5edbc8e83d99b"
SRC_URI[sha256sum] = "313fd0914438b8cd3a35890370e4e77437aafa8eda23e59522c4df2387e21e88"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
