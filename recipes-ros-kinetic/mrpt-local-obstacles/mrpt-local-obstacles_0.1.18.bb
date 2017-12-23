# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Maintains a local obstacle map (point cloud,    voxels or occupancy grid) from r"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure mrpt-bridge roscpp sensor-msgs tf visualization-msgs"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_local_obstacles/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "81bbfc2c3f53c5b78471902c34e1c0f3"
SRC_URI[sha256sum] = "d26ee59f85e64d1b2743ec5b213e610bce855520aebd4968db4f359e8b552088"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_local_obstacles-0.1.18-0"

inherit catkin
