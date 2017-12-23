# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_obstacle_distance package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "assimp-dev boost catkin-native cmake-modules cob-control-msgs cob-srvs dynamic-reconfigure eigen eigen-conversions geometry-msgs interactive-markers joint-state-publisher kdl-conversions kdl-parser libfcl-dev moveit-msgs orocos-kdl pkgconfig robot-state-publisher roscpp roslib roslint rospy rviz sensor-msgs shape-msgs std-msgs tf tf-conversions urdf visualization-msgs xacro"
SRC_URI = "https://github.com/ipa320/cob_control-release/archive/release/kinetic/cob_obstacle_distance/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "91efc32aadf02c29c2e92607c826157d"
SRC_URI[sha256sum] = "7ba21491397730057bcc93a6dd0498aa32af497962ebccff77e143d74598a89c"
S = "${WORKDIR}/cob_control-release-release-kinetic-cob_obstacle_distance-0.7.0-0"

inherit catkin
