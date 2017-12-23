# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages and services for humanoid robot navigation"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/humanoid_msgs-release/archive/release/kinetic/humanoid_nav_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "34c339e6e7f752cbd55771f3366e6690"
SRC_URI[sha256sum] = "80f6163d1ad0170811809fff118132f99cc4ac39af51339f51f5c3d66490289b"
S = "${WORKDIR}/humanoid_msgs-release-release-kinetic-humanoid_nav_msgs-0.3.0-0"

inherit catkin
