# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a number of URDF tutorials."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=7ac47145742471767839f52ebe471b49"

DEPENDS = "catkin joint_state_publisher robot_state_publisher roslaunch rviz xacro"
SRC_URI = "https://github.com/ros-gbp/urdf_tutorial-release/archive/release/lunar/urdf_tutorial/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80f3fd90b97591ae1f0c445253e767c7"
SRC_URI[sha256sum] = "891c634f5f4385043671dff8090ed67a1a9cb4bbc3a45b54492e5efe1ffddb01"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
