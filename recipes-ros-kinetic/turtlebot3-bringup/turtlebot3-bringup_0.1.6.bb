# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslaunch scripts for starting the TurtleBot3"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native hls-lfcd-lds-driver robot-state-publisher rosserial-python turtlebot3-description turtlebot3-teleop"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_bringup/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1930cb3a1a33b632c8c8387215bc0d4f"
SRC_URI[sha256sum] = "51a3479c7e1537a253e1c7f3dad1906c5573a04f1df1bad960d25e41ab7f85ab"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_bringup-0.1.6-0"

inherit catkin
