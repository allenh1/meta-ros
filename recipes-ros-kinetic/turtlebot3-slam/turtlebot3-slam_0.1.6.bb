# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The turtlebot3_slam package provides roslaunch scripts for starting the SLAM"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "catkin-native gmapping turtlebot3-bringup"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/kinetic/turtlebot3_slam/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a35b0b89a4491c030e08952fe9599a27"
SRC_URI[sha256sum] = "d2bbbbf8339428865099a57c5df580b69124cf8f58cc7cfca31ed6f24048258c"
S = "${WORKDIR}/turtlebot3-release-release-kinetic-turtlebot3_slam-0.1.6-0"

inherit catkin
