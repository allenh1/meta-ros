# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interaction management for human interactive agents in the concert."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genpy python-catkin-pkg-native python-rospkg rocon-app-manager-msgs rocon-bubble-icons rocon-console rocon-icons rocon-interaction-msgs rocon-python-comms rocon-python-utils rocon-std-msgs rocon-uri roslint rospy rostest std-msgs unique-id"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_interactions/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a867d1c3f9c018be300b3b7fc54ada85"
SRC_URI[sha256sum] = "40d5fe2c086b4010eb8d9cd47ebe61fe983e7078af9c17bf05a696be5d8f5c09"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_interactions-0.3.2-1"

inherit catkin
