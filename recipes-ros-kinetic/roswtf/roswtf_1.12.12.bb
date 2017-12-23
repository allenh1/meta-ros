# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roswtf is a tool for diagnosing issues with a running ROS system. Think of it as"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-paramiko python-rospkg rosbuild rosgraph roslaunch roslib rosnode rosservice rostest"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2f4466791d699e98b7b90ed7a9cdc64"
SRC_URI[sha256sum] = "1e957d0e358d62bd619a2eeecd556f12fb6b5f572cfd5ca20e9f79557a9ec9b0"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
