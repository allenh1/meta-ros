# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "this package contains a set of messages that are used by the introspection     i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-gbp/executive_smach-release/archive/release/lunar/smach_msgs/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "831939838c3d44b9f1e4a89024cd4eb5"
SRC_URI[sha256sum] = "c5434f699ab79f7a0ffa77e653a81de19b8238ef6e7b1adaf2a59cc08ab771f3"
S = "${WORKDIR}/executive_smach-release-release-lunar-smach_msgs-2.0.1-0"

inherit catkin
