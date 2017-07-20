# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "moveit_runtime meta package contains MoveIt! packages that are essential for its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin moveit-core moveit-planners moveit-plugins moveit-ros-manipulation moveit-ros-move-group moveit-ros-perception moveit-ros-planning moveit-ros-planning-interface moveit-ros-warehouse"
SRC_URI = "https://github.com/ros-gbp/moveit-release/archive/release/lunar/moveit_runtime/0.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "47e980fce05ecc3ea6431142d03c9ec2"
SRC_URI[sha256sum] = "9af66d3f7ba2389039d0c4db0d8c3b39dcf65bdfb5e35448840bec256cc957af"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
