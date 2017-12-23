# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files and tools for 3D simulation of Care-O-bot in gazebo simulator."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-bringup cob-default-robot-config cob-gazebo-ros-control cob-hardware-config cob-script-server control-msgs gazebo-plugins gazebo-ros gazebo-ros-control roslaunch rospy rostest trajectory-msgs"
SRC_URI = "https://github.com/ipa320/cob_simulation-release/archive/release/kinetic/cob_gazebo/0.6.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0da467478f1ea51ce6899b8dd168ffd2"
SRC_URI[sha256sum] = "b45e3a398b4bd85e9fca93485164180bc3293cdac1d06665650bf5358698ebad"
S = "${WORKDIR}/cob_simulation-release-release-kinetic-cob_gazebo-0.6.8-0"

inherit catkin
