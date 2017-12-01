# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The core rosbridge package, repsonsible for interpreting JSON andperforming     "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime python-bson python-imaging roscpp rosgraph rospy rosservice rostopic std-msgs"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/lunar/rosbridge_library/0.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46d027373fda6f22bf3757eac412bb20"
SRC_URI[sha256sum] = "8c9f703b89713daf7e66ee6fca2a8f421bdb82edf349a04099fcbd4248c21855"
S = "${WORKDIR}/rosbridge_suite-release-release-lunar-rosbridge_library-0.8.4-0"

inherit catkin
