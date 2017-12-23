# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulation_msgs package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs household-objects-database-msgs message-generation message-runtime sensor-msgs shape-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/manipulation_msgs-release/archive/release/kinetic/manipulation_msgs/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "933601741634a3583961737704f27614"
SRC_URI[sha256sum] = "683485c3defaa7d347495dbb354af782651a08b3d8ec46454ece6238cfc2d769"
S = "${WORKDIR}/manipulation_msgs-release-release-kinetic-manipulation_msgs-0.2.1-0"

inherit catkin
