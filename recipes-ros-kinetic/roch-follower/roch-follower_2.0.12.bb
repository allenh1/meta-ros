# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Follower for the roch. Follows humans and robots around by following the centroi"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native depth-image-proc dynamic-reconfigure nodelet roch-bringup roch-msgs roch-teleop roscpp topic-tools visualization-msgs"
SRC_URI = "https://github.com/SawYerRobotics-release/roch-release/archive/release/kinetic/roch_follower/2.0.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80b91f3c35a37b1734a0683420f35af3"
SRC_URI[sha256sum] = "53eebac8a0d8c2ad29cc9f861e70e5cc74a335a54723b1d1f7fb4b1c7e758102"
S = "${WORKDIR}/roch-release-release-kinetic-roch_follower-2.0.12-0"

inherit catkin
