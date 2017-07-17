# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with
    ROS t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=67642afa574152203192f1117380344b"

DEPENDS = "catkin cpp_common message_generation message_runtime rosconsole roscpp rostest rostime rosunit std_msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/topic_tools/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "384206d9ee95306160a8fe420fd4fd20"
SRC_URI[sha256sum] = "688c1730932bb47e6df47ee3b0cafb9ec565dfe057fe0114147294e3f323bddf"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
