# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin geographic_msgs geometry_msgs marti_common_msgs message_generation message_runtime sensor_msgs std_msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_nav_msgs/0.0.9-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2a3ada858e4fade8d20cd7bf2e24957"
SRC_URI[sha256sum] = "841013710de98dcde0b2efed75633b8526e707bfc6bfb3a9aec170d2e3ac5a7d"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
